package lf.facimate.api.core.config;

import lf.facimate.api.core.commons.EntityConverter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    @Bean
    public EntityConverter entityConverter(ModelMapper modelMapper) {
        return new EntityConverter(modelMapper);
    }
}
