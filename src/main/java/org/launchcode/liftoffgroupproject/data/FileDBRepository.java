package org.launchcode.liftoffgroupproject.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.launchcode.liftoffgroupproject.models.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}