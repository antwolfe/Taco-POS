import "./App.css";
import React, { useState } from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import NavBar from "./Views/NavBar.jsx";
import inventoryData from "./inventory2.json";
import ProductsPage from "./Views/ProductsPage";
import ProductDetail from "./Views/ProductDetail";
import Cart from "./Views/Cart";
import Login from "./Views/Login";
import InventoryChart from "./Views/InventoryChart";
import Checkout from "./Views/Checkout";
import Order from "./Components/Order";

export default function App() {
  const products = inventoryData;
  const [items, setItems] = useState(products);
  const [cartItems, setCartItems] = useState([]);
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const addToCart = (product) => {
    setCartItems([...cartItems, product]);
  };

  const deleteFromCart = (product) => {
    setCartItems(cartItems.filter((item) => item.id !== product.id));
  };

  const handleDuplicates = (product) => {
    //if product.id === cartitems.map(item => item.id){
    // increaseQty of product
    if (cartItems.indexOf(product) !== -1) return;
    setCartItems([...cartItems, product]);
  };

  return (
    <div className="App">
      <Router>
        <NavBar />

        <Routes>
          <Route
            path="/"
            element={<ProductsPage products={products} setItems={setItems} />}
          />

          <Route
            path="/products"
            element={<ProductsPage products={products} setItems={setItems} />}
          />
          <Route path="/book" element={<ProductDetail onAdd={addToCart} />} />
          <Route
            path="/cart"
            element={
              <Cart
                products={products}
                cartItems={cartItems}
                onDelete={deleteFromCart}
                setCartItems={setCartItems}
              />
            }
          />
          <Route path="/checkout" element={<Checkout />} />

          <Route path="/order" element={<Order />} />

          <Route
            path="/login"
            element={
              <Login isLoggedIn={isLoggedIn} setIsLoggedIn={setIsLoggedIn} />
            }
          />
          <Route
            path="/admin"
            element={<InventoryChart items={items} setItems={setItems} />}
          />
        </Routes>
      </Router>
    </div>
  );
}
