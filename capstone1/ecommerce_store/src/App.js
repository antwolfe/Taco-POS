import "./App.css";
import NavBar from "./Components/NavBar.jsx";
import HomePage from "./Components/HomePage";
import ParseInventory from "./Components/ParseInventory";
import ProductPreview from "./Components/ProductPreview";
import ProductsPage from "./Components/ProductsPage";
import HomeBar from "./Components/HomeBar";

export default function App() {
  return (
    <div>
      <NavBar />
      {/* <HomePage /> */}
      <ProductsPage />
    </div>
  );
}
