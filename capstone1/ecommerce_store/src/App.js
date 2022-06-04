import "./App.css";
import React, { useState } from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import NavBar from "./Views/NavBar.jsx";
import inventoryData from "./inventory2.json";
import HomePage from "./Views/HomePage";
import ProductsPage from "./Views/ProductsPage";
import ProductDetail from "./Views/ProductDetail";
import Basket from "./Views/Basket";

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

  const modifyItemQty = (product) => {};

  return (
    <main className="App">
      <Router>
        <NavBar />
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
        </Routes>
      </Router>
    </main>
  );
}
