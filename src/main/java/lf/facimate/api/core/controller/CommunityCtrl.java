package lf.facimate.api.core.controller;



import lf.facimate.api.core.commons.ApplicationException;
import lf.facimate.api.core.service.CommunityServ;
import lf.facimate.api.core.vo.CommunityVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/community")
public class CommunityCtrl {

    private final CommunityServ communityServ;

    @Autowired
    public CommunityCtrl(CommunityServ communityServ) {
        this.communityServ = communityServ;
    }


    @PostMapping
    public ResponseEntity<Object> addOrUpdate(@RequestHeader("CLIENT_KEY") String clientKey,
                                              @RequestBody CommunityVO communityVO) {
        try {
            communityServ.saveCommunity(communityVO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@RequestHeader("CLIENT_KEY") String clientKey, @PathVariable long id) {
        try {
            return ResponseEntity.accepted().body(communityServ.getById(id));
        } catch (ApplicationException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
