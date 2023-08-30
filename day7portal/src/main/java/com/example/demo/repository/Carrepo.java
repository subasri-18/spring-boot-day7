package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Carentity;

@Repository
public interface Carrepo extends JpaRepository<Carentity, Integer> {
	
	@Query(value="select * from cartable where owners=:s",nativeQuery=true)
	public List<Carentity> getcarInfo(@Param("s") int owners);
	
	@Query(value="select * from cartable where address=:address",nativeQuery=true)
	public List<Carentity> getcarInfoaddress(@Param("address") String address);
	
	@Query(value="select * from cartable where carname=:carname",nativeQuery=true)
	public List<Carentity> getcarInfoname(@Param("carname") String carname);

	@Query(value="select * from cartable where owners=:owners and carType=:cartype",nativeQuery=true)
	public List<Carentity> getcarInfobytypes(@Param("owners") int owners,@Param("cartype") String carType);
	
}