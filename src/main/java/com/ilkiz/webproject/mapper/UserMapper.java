package com.ilkiz.webproject.mapper;
import com.ilkiz.webproject.dto.request.UserSaveRequestDto;
import com.ilkiz.webproject.dto.response.UserSaveResponseDto;
import com.ilkiz.webproject.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserSaveResponseDto toUserSaveResponseDto(User user);

    User toUser(UserSaveRequestDto dto);
}
