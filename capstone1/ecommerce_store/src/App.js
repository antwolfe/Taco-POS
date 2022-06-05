import "./App.css";
import React, { useState } from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import NavBar from "./Views/NavBar.jsx";
import inventoryData from "./inventory2.json";
import HomePage from "./Views/HomePage";
import ProductsPage from "./Views/ProductsPage";
import ProductDetail from "./Views/ProductDetail";
import Basket from "./Views/Basket";
import Login from "./Views/Login";

export default function App() {
  const products = inventoryData;
  const [cartItems, setCartItems] = useState([]);

  const addToCart = (product) => {
    console.log("Add", product.title);
    setCartItems([...cartItems, product]);
  };

  const deleteFromCart = (product) => {
    console.log("Deleting", product.title);
    setCartItems(cartItems.filter((item) => item.id !== product.id));
  };

  const handleDuplicates = (product) => {
    //if product.id === cartitems.map(item => item.id){
    // increaseQty of product
    if (cartItems.indexOf(product) !== -1) return;
    setCartItems([...cartItems, product]);
  };

  return (
    <main className="App">
      <Router>
        <NavBar products={products} />
        <Routes>
          <Route path="/" element={<HomePage />} />

          <Route
            path="/products"
            element={<ProductsPage products={products} />}
          />

          <Route path="/book" element={<ProductDetail onAdd={addToCart} />} />

          <Route
            path="/cart"
            element={
              <Basket
                products={products}
                cartItems={cartItems}
                onDelete={deleteFromCart}
                setCartItems={setCartItems}
              />
            }
          />

          <Route path="/login" element={<Login />} />
        </Routes>
      </Router>
    </main>
  );
}
