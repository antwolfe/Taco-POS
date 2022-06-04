import "./App.css";
import React, { useState } from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import NavBar from "./Views/NavBar.jsx";
import inventoryData from "./inventory2.json";
import HomePage from "./Views/HomePage";
import ProductsPage from "./Views/ProductsPage";
import ProductDetail from "./Views/ProductDetail";
import CartDisplay from "./Views/Basket";
import AddToCartModal from "./Components/AddToCartModal";
import CartItem from "./Components/CartItem";
import CartTotal from "./Components/CartTotal";
import Basket from "./Views/Basket";

export default function App() {
  const products = inventoryData;
  const [cartItems, setCartItems] = useState([]);

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

          <Route
            path="/book"
            element={
              <ProductDetail
                cartItems={cartItems}
                setCartItems={setCartItems}
              />
            }
          />

          <Route
            path="/cart"
            element={
              <Basket
                cartItems={cartItems}
                setCartItems={setCartItems}
                products={products}
              />
            }
          />
        </Routes>
      </Router>
    </main>
  );
}
