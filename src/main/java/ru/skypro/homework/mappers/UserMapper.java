package ru.skypro.homework.mappers;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.skypro.homework.dto.UserDto;
import ru.skypro.homework.model.User;
@Component
public class UserMapper {


        private ModelMapper modelMapper;

        public UserMapper() {
            this.modelMapper = new ModelMapper();
        }

        // Метод для маппинга UserDto в User
        public static User mapToUser(UserDto userDto) {
            return new User(userDto);
        }

        // Метод для маппинга User в UserDto
        public static UserDto mapToUserDto(User user) {
            return new UserDto(user);
        }
    }
