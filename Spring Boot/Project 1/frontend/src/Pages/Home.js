import React, { useEffect, useState } from 'react'
import axios from 'axios'

export default function Home() {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        loadUsers();
    }, []);

    const loadUsers = async () => {
        const result = await axios.get("http://localhost:8080/users");
        setUsers(result.data);
    };

  return (
    <div className='container'>
        <div className='py-4'>
        <table className="table table-dark table-hover shadow">
        <thead>
            <tr>
            <th scope="col">ID</th>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">Email</th>
            <th scope="col">Action</th>
            </tr>
        </thead>
        <tbody>
            {
                users.map((user,index)=>(
                    <tr>
                    <th scope="row" key={index}>{index+1}</th>
                    <td>{user.name}</td>
                    <td>{user.username}</td>
                    <td>{user.email}</td>
                    <td>
                        <Link className='btn btn-primary max-2' to={`/viewemployee/${employee.id}`}>View</Link>
                        <Link className='btn btn-outline-primary max-2' to={`/editemployee/${employee.id}`}>Edit</Link>
                        <button className='btn btn-danger max-2' onClick={() => deleteEmployee(employee.id)}>Delete</button>
                    </td>
                    </tr>
                ))
            }
        </tbody>
        </table>
        </div>
    </div>
  )
}
