import React, { useState, useEffect } from "react";
import axios from "axios";
function FactComponent(){
    const [datas, setData]=useState([])

    useEffect(() => {
        getData()
    }, [])

    const getData = () => {
        axios.get('https://cat-fact.herokuapp.com/facts/').then((response) => {
            setData(response.data)
            console.log(response.data);
        });
    };
    return(
        <div>
            <h1>Cat Table</h1>
            <table border="1">
                <thead>
                    <tr><th>SentCount</th>
                        <th> Id</th>
                        <th> UserId</th>
                        <th> Text</th>
                        <th> Source</th>
                        <th> UpdatedAt</th>
                        <th> Type</th>
                        <th> CreatedAt</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        datas.map(
                            data =>
                                <tr key={data._id}>
                                    <td>{data.status.verified.toString()}</td>
                                    <td>{data.status.sentCount}</td>
                                    <td>{data._id}</td>
                                    <td>{data.user}</td>
                                    <td>{data.text}</td>
                                    <td>{data.source}</td>
                                    <td>{data.updatedAt}</td>
                                    <td>{data.type}</td>
                                    <td>{data.createdAt}</td>
                                </tr>
                            )
                    }
                </tbody>
            </table>
        </div>
    );
}

export default FactComponent;