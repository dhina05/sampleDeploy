package lf.facimate.api.core.commons;

import org.modelmapper.ModelMapper;

import java.util.List;


public class EntityConverter {
    private final ModelMapper modelMapper;

    public EntityConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public <E, V> V convertEntityToVO(E entity, Class<V> voClass) {
        return modelMapper.map(entity, voClass);
    }

    public <E, V> E convertVOToEntity(V vo, Class<E> entityClass) {
        return modelMapper.map(vo, entityClass);
    }

    public <E, V> List<V> convertListToVOList(List<E> entityList, Class<V> voClass) {
        return entityList.stream()
                .map(entity -> convertEntityToVO(entity, voClass))
                .toList();
    }

    public <E, V> List<E> convertVOListToList(List<V> voList, Class<E> entityClass) {
        return voList.stream()
                .map(vo -> convertVOToEntity(vo, entityClass))
                .toList();
    }
}
