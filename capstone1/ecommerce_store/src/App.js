import "./App.css";
import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import NavBar from "./Views/NavBar.jsx";
import inventoryData from "./inventory2.json";

import HomePage from "./Views/HomePage";
import ProductsPage from "./Views/ProductsPage";
import ProductDetail from "./Views/ProductDetail";
import CartDisplay from "./Views/CartDisplay";
import AddToCartModal from "./Components/AddToCartModal";
import CartItem from "./Components/CartItem";
import CartTotal from "./Components/CartTotal";
import ParseInventory from "./Components/ParseInventory";

export default function App() {
  const products = inventoryData;
  return (
    <div>
      <Router>
        <NavBar />
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route
            path="/products"
            element={<ProductsPage products={products} />}
          />
          <Route path="/book" element={<ProductDetail />} />
        </Routes>
      </Router>
    </div>
  );
}
