import React, { useEffect, useState } from 'react'
import axios from 'axios'

export default function Home() {

    const [users, setUsers] = useState([]);

    useEffect(() => {
        loadUsers();
    },[]);

    const loadUsers = async() => {
        const result = await axios.get("http://localhost:8080/users");
        setUsers(result.data);
    }

  return (
    <div className='container'>
        <div className='py-4'>
            <table className='table table-dark table-hover shadow'>
                <thead>
                    <tr>
                        <th scope='col'>#</th>
                        <th scope='col'>First Name</th>
                        <th scope='col'>Last Name</th>
                        <th scope='col'>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        users.map((user,index)=>(
                            <tr>
                            <th scope='row' key={index}>{index+1}</th>
                            <th>{user.name}</th>
                            <th>{user.username}</th>
                            <th>{user.email}</th>
                            </tr>
                        ))
                    }
                    
                </tbody>
            </table>
        </div>
    </div>
  )
}
