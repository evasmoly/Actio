package com.actiosol.eventmanagement.rest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.actiosol.eventmanagement.model.Event;
import com.actiosol.eventmanagement.model.EventCategory;

@Path("/events")
public class EventsResource {

	@GET()
	@Produces(MediaType.APPLICATION_JSON)
	public Response Event() throws ParseException {
		Event event = new Event();
		event.setName("Adverse Reaction");
		
		String string = "January 2, 2010";
		Date date = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(string);
				
		event.setDate(date.toString());
		event.setDescription("Just standard reaction!");
		List<EventCategory>  listCategory = new ArrayList<EventCategory>();
		String listDesc = "Patient Data Discrepancy, Patient Issue, Study Conduct Issue,Site Issue, Randomization Issue, Clinical Supply Issue, Serious AE, Study Design Issue,Study Analysis Issue,External Partner (CRO) Issue";
		int index = 0;
		for (String desc : listDesc.split(",")) 
		{
			EventCategory ec = new EventCategory();
			ec.setId(index);
			ec.setDescription(desc);
			listCategory.add(ec);
			
			index++;
		}

		event.setCategory(listCategory);
		return Response.status(200).entity(event).build();
	}
}
