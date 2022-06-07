import { useState, useEffect } from "react";
import HomeBar from "./HomeBar";
import ProductPreview from "./ProductPreview";

export default function ProductsPage({ products }) {
  const [query, setQuery] = useState("");
  const [results, setResults] = useState(products);

  useEffect(() => {
    const allProducts = [...products];
    const newItems = products.filter((item) => {
      if (query == "") {
        return allProducts;
      } else {
        if (item.title.toLowerCase().includes(query.toLowerCase())) {
          return item;
        } else if (item.year.toString().includes(query)) {
          return item;
        }
      }
    });
    setResults(newItems);
  }, [query]);

  return (
    <div>
      <input
        className="searchbar"
        value={query}
        name="search"
        placeholder="Search..."
        onChange={(e) => setQuery(e.target.value)}
      />

      <div className="all-products">
        {results.map((product) => {
          return <ProductPreview key={product.id} product={product} />;
        })}
      </div>
      <HomeBar />
    </div>
  );
}
