import "./App.css";
import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import NavBar from "./Components/NavBar.jsx";
import HomePage from "./Components/HomePage";
import ParseInventory from "./Components/ParseInventory";
import ProductPreview from "./Components/ProductPreview";
import ProductsPage from "./Components/ProductsPage";
import HomeBar from "./Components/HomeBar";
import ProductDetail from "./Components/ProductDetail";

export default function App() {
  return (
    <div>
      <Router>
        <NavBar />
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="/products" element={<ProductsPage />} />
          <Route path="/book" element={<ProductDetail />} />
        </Routes>
      </Router>
    </div>
  );
}
