import React, { useState, useEffect } from "react";
import DataService from "./DataService";
function CommentsComponent(){
    const [datas, setData]=useState([])

    useEffect(() => {
        getData()
    }, [])

    const getData = () => {
        DataService.getData().then((response) => {
            setData(response.data.comments)
            console.log(response.data);
        });
    };
    return(
        <div>
            <h1>Data Comments Table</h1>
            <table border="1">
                <thead>
                    <tr>
                        
                        <th> Data Id</th>
                        <th> Data Email</th>
                        <th> Data Body</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        datas.map(
                            data =>
                                <tr key={data.id}>
                                    <td>{data.id}</td>
                                    <td>{data.email}</td>
                                    <td>{data.body}</td>
                                </tr>
                            )
                    }
                </tbody>
            </table>
        </div>
    );
}

export default CommentsComponent;