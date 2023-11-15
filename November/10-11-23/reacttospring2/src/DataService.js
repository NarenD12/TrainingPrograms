import axios from "axios";

class DataService{

    getData(){
        return axios.get('https://jsonplaceholder.typicode.com/db');
    }
}
export default new DataService();