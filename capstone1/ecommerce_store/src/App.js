import "./App.css";
import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import NavBar from "./Views/NavBar.jsx";
import HomePage from "./Views/HomePage";
import ProductsPage from "./Views/ProductsPage";
import ProductDetail from "./Views/ProductDetail";

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
