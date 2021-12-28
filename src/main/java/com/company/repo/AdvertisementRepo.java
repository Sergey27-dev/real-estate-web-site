package com.company.repo;

import com.company.domain.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepo extends JpaRepository<Advertisement, Long> {
//    @Query("select a from Advertisement a where a.type = :type and a.numberOfRooms = :rooms and a.price < :price or a.type = :type and a.numberOfRooms = :rooms or a.type = :type and a.price < :price")
//    List<Advertisement> findAdvertisementByTypeAndNumberOfRoomsAndPrice(
//            @Param("type") String type,
//            @Param("rooms") String rooms,
//            @Param("price") String price
//    );

    @Query("select a from Advertisement a where " +
            "?1 <> '' and a.type = ?1 or ?2 <> '' and a.numberOfRooms = ?2 or" +
            "?3 <> 0 and a.price >= ?3 and ?4 = 0 or " +
            "?4 <> 0 and a.price <= ?4 and ?3 = 0 or " +
            "?3 <> 0 and ?4 <> 0 and a.price between ?3 AND ?4")
    List<Advertisement> findAdvertisementByTypeAndNumberOfRoomsAndPrice(
            String type,
            String rooms,
            int price_ot,
            int price_do
    );

    @Query("select a from Advertisement a where a.userEmail = :email")
    List<Advertisement> findByUserEmail(
      @Param("email") String email
    );

}
