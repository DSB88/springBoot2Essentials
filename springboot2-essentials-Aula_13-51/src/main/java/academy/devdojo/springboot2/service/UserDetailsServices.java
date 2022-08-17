package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDetailsServices implements UserDetailsService {
    private final UserRepository UserRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        return Optional.ofNullable(UserRepository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

}

