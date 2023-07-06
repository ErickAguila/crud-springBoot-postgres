package com.aguila.crudpostgres.mapper;

import com.aguila.crudpostgres.dto.UserDTO;
import com.aguila.crudpostgres.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class UserMapper {
    private final ModelMapper modelMapper;

    public UserDTO convertEntitytoDTO(User entity) {
        modelMapper.getConfiguration().
                setMatchingStrategy(MatchingStrategies.LOOSE);
        return  modelMapper.map(entity, UserDTO.class);
    }
}
