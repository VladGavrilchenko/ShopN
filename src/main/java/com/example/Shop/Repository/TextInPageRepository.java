package com.example.Shop.Repository;

import com.example.Shop.model.TextInPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextInPageRepository extends JpaRepository<TextInPage,Long> {

    TextInPage findTextInPageByNameTextEquals(String nameText);
}
