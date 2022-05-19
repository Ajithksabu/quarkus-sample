package com.strebentechnik.logistix.hr.employee;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/employees")
@Tag(name = "Employees")
public class EmployeeResource {

    // Create Employee
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response createEmployee(EmployeeEntity employeeEntity) {
        employeeEntity.persist();
        return Response.status(Status.CREATED).build();
    }

    // Get all employees
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAllEmployees() {
        return Response.ok(EmployeeEntity.listAll()).build();
    }

    // Get employee by ID
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployeeById(@PathParam("id") Long id) {
        EmployeeEntity employeeEntity = EmployeeEntity.findById(id);
        return Response.ok(employeeEntity).build();
    }

    // Delete employee by ID
    @Path("/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteEmployee(@PathParam("id") Long id) {
        EmployeeEntity.deleteById(id);
        return Response.noContent().build();
    }

}
