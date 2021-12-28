package com.company.repo;

import com.company.domain.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepo extends JpaRepository<Advertisement, Long> {
    //@Query("select a from Advertisement a where a.type = :type and a.numberOfRooms = :rooms and a.price < :price or a.type = :type and a.numberOfRooms = :rooms or a.type = :type and a.price < :price")
    @Query("select a from Advertisement a where (a.type = :type and a.numberOfRooms = :rooms and a.price < :price) or (a.type = :type and a.numberOfRooms = :rooms) or (a.type = :type and a.price < :price) or (a.type = :type or a.numberOfRooms = :rooms or a.price < :price)")
    List<Advertisement> findAdvertisementByTypeAndNumberOfRoomsAndPrice(
            @Param("type") String type,
            @Param("rooms") String rooms,
            @Param("price") String price
    );

}
