import React, { useState, useEffect } from "react";
import DataService from "./DataService";
function DataComponent(){
    const [datas, setData]=useState([])

    useEffect(() => {
        getData()
    }, [])

    const getData = () => {
        DataService.getData().then((response) => {
            setData(response.data.posts)
            console.log(response.data);
        });
    };
    return(
        <div>
            <h1>Data Posts Table</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th> Data UserId</th>
                        <th> Data Id</th>
                        <th> Data Title</th>
                        <th> Data Body</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        datas.map(
                            data =>
                                <tr key={data.id}>
                                    <td>{data.userId}</td>
                                    <td>{data.id}</td>
                                    <td>{data.title}</td>
                                    <td>{data.body}</td>
                                </tr>
                            )
                    }
                </tbody>
            </table>
        </div>
    );
}

export default DataComponent;