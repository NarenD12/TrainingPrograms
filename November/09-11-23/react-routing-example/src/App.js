import logo from './logo.svg';
import './App.css';
import Navbar from './component/Navbar';
import Blog from './component/Blog';
import About from './component/About';
import Contact from './component/Contact';
import Services from './component/Services';
import Team from './component/Team';
import Home from './component/Home';
import { Route, Routes }from 'react-router-dom';

function App() {
  return (
    <>
    <Navbar/>
    <Routes>
      <Route path="/" element={<Home/>}/>
      <Route path="/blog" element={<Blog/>}/>
      <Route path="/about" element={<About/>}/>
      <Route path="/contact" element={<Contact/>}/>
      <Route path="/services" element={<Services/>}/>
      <Route path="/team" element={<Team/>}/>
    </Routes>
    </>
  );
}

export default App;
