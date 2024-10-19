package com.xdavide9.demo.jpa.repositories.user.billing;

import com.xdavide9.demo.jpa.entities.user.billing.Address;
import com.xdavide9.demo.jpa.entities.user.billing.AddressId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, AddressId> {
}
