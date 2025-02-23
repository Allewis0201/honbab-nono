package com.estsoft.for1person.repository;

import com.estsoft.for1person.entity.CommentVip;
import com.estsoft.for1person.entity.User;
import com.estsoft.for1person.entity.Vip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VipRepository extends JpaRepository<Vip, Long> {

    Integer countVipByUser(User user);

    List<Vip> findAllByTitle(String searchKey);

    List<Vip> findAllByUser(User findUser);
}
