import React from 'react'

export default function Home() {
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
                    <tr>
                    <th scope='row'>1</th>
                    <th>Mark</th>
                    <th>Otto</th>
                    <th>Test</th>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
  )
}
