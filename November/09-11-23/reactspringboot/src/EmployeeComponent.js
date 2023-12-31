import React, { useState, useEffect } from "react";
import EmployeeService from "./EmployeeService";

function EmployeeComponent() {
    const [employees, setEmployees] = useState([])

    useEffect(() => {
        getEmployees()
    }, [])

    const getEmployees = () => {
        EmployeeService.getEmployees().then((response) => {
            setEmployees(response.data)
            console.log(response.data);
        });
    };
    return (
        <div>
            <h1>Employee Table</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th> Employee Id</th>
                        <th> Employee First Name</th>
                        <th> Employee Last</th>
                        <th> Employee Email</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        employees.map(
                            employee =>
                                <tr key={employee.id}>
                                    <td>{employee.id}</td>
                                    <td>{employee.firstName}</td>
                                    <td>{employee.lastName}</td>
                                    <td>{employee.email}</td>
                                </tr>
                            )
                    }
                </tbody>
            </table>
        </div>
    );
}

export default EmployeeComponent;