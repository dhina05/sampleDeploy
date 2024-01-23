package lf.facimate.api.core.service;

import lf.facimate.api.core.commons.ApplicationException;
import lf.facimate.api.core.commons.EntityConverter;
import lf.facimate.api.core.model.Community;
import lf.facimate.api.core.repo.CommunityRepo;
import lf.facimate.api.core.vo.CommunityVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CommunityServ {
    Logger logger = LoggerFactory.getLogger(CommunityServ.class);
    private final CommunityRepo communityRepo;
    private final EntityConverter entityConverter;

    @Autowired
    public CommunityServ(CommunityRepo communityRepo,EntityConverter entityConverter){
        this.communityRepo = communityRepo;
        this.entityConverter = entityConverter;
    }

    public void saveCommunity(CommunityVO communityVO){
        Date date = new Date();
        if (communityVO.getId() == 0){
            communityVO.setCreatedBy(communityVO.getUpdatedBy());
            communityVO.setCreatedDate(date);
        }
        communityVO.setUpdatedDate(date);
        Community community = entityConverter.convertVOToEntity(communityVO,Community.class);
        communityRepo.save(community);
    }
    public Community getById(long id) throws ApplicationException {
        Optional<Community> community = communityRepo.findById(id);
        if (community.isPresent()){
            return community.get();
        }else {
            throw new ApplicationException("Details Not Found for this Id");

        }
    }
}
