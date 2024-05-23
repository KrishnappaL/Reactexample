import react from 'react';
function Mobiles({brandname="abcd",brandprice}){//props
    return(
        <>
        <div class="card">
  <div class="card-body">
    <h5 class="card-title">{brandname}</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
   <p>{brandprice}</p>
   <button><a href="#" class="btn btn-primary">Go somewhere</a></button>
  </div>
</div>
        </>
    )
}
export default Mobiles;