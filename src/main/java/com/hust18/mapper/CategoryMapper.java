package com.hust18.mapper;
 
import java.util.List;

import com.hust18.pojo.Category;
import com.hust18.util.Page;
 
public interface CategoryMapper {
 
      
    public int add(Category category);  
       
      
    public void delete(int id);  
       
      
    public Category get(int id);  
     
      
    public int update(Category category);   
       
      
    public List<Category> list();
      
}