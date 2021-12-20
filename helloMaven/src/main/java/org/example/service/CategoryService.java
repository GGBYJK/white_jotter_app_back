package org.example.service;

import org.example.dao.CategoryDAO;
import org.example.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public List<Category> list(){
        return  categoryDAO.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public Category get(int id) {
        Category category = categoryDAO.findById(id).orElse(null);
        return category;
    }
}
