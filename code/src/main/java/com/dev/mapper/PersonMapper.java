package com.dev.mapper;

import com.dev.dto.PersonDto;
import com.dev.entity.PersonEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonEntity toPersonEntity(PersonDto person);

    PersonDto toPerson(PersonEntity personEntity);
}
