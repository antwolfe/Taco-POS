import HomeBar from "./HomeBar";
import ProductPreview from "./ProductPreview";

export default function ProductsPage({ products }) {
  return (
    <div>
      {products.map((product) => {
        return <ProductPreview key={product.id} product={product} />;
      })}

      <HomeBar />
    </div>
  );
}
