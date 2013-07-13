package com.actiosol.eventmanagement.model;

import java.util.List;


public class Event {
	
	 private String name;
     private String description;
     private String date;
     private List<EventCategory> categories;
     

     public String getName()
     {
        return name;
     }

     public void setName(String name)
     {
        this.name = name;
     }
     

     public String getDescription()
     {
        return description;
     }
     
     public void setDescription(String description)
     {
        this.description = description;
     }

     
     public void setDate(String date)
     {
        this.date = date;
     }
     
     public String getDate()
     {
        return date;
     }

     public void setCategory(List<EventCategory> categories)
     {
        this.categories = categories;
     }
     
     public List<EventCategory> getCategory()
     {
        return categories;
     }

}
