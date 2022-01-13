package com.alan.finalAPIconsultorios.serviceImpl;

import com.alan.finalAPIconsultorios.dtos.GenericMapperDTO;
import com.alan.finalAPIconsultorios.dtos.SimpleUserDTO;
import com.alan.finalAPIconsultorios.exception.ResourceNotFoundException;
import com.alan.finalAPIconsultorios.models.User;
import com.alan.finalAPIconsultorios.respository.GenericRepository;
import com.alan.finalAPIconsultorios.respository.UserRepository;
import com.alan.finalAPIconsultorios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class UserServiceImpl extends GenericServiceImpl<User,Long> implements UserService {
    @Autowired
    private UserRepository userRepository;

    static GenericMapperDTO genericMapperDTO = GenericMapperDTO.singleInstance();

    public UserServiceImpl(GenericRepository<User, Long> genericRepository) {
        super(genericRepository);
    }

    @Async("asyncExecutor")
    @Transactional
    public CompletableFuture<List<SimpleUserDTO>> getAllDTO(){
        System.out.println(Thread.currentThread().getName());
        List<User> entities = userRepository.findAll();
        List<SimpleUserDTO> dtos = new ArrayList<>();
        for(User user: entities){
            SimpleUserDTO userSimpleDTO;
            userSimpleDTO = genericMapperDTO.mapToSimpleUserDTO(user);
            dtos.add(userSimpleDTO);
        }
        return CompletableFuture.completedFuture(dtos);
    }

    @Async("asyncExecutor")
    @Transactional
    public CompletableFuture<User> getOneUserDTO(Long id){
        System.out.println(Thread.currentThread().getName());
        return CompletableFuture.completedFuture(genericRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Entity", "Id", id)));
    }


}
