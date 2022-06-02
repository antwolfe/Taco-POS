import "./App.css";
import NavBar from "./Components/NavBar.jsx";
import HomePage from "./Components/HomePage";
import ParseInventory from "./Components/ParseInventory";
import ProductsPage from "./Components/ProductsPage";

export default function App() {
  return (
    <div>
      <NavBar />
      {/* <HomePage /> */}
      <ProductsPage />
    </div>
  );
}
