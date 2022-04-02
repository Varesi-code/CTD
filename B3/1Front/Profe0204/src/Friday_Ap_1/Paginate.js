import React from "react";

const Paginate = ({ totalPosts, postsPerPage, paginateFn})=>{
    const pageNumber = [];
    for(let i = 1; i <= Math.ceil(totalPosts / postsPerPage ); i++){
        pageNumber.push(i)
    }

    return(
        <div>
            {
                pageNumber.map( number=>
                    <button 
                        key={number}
                        onClick={()=> paginateFn(number)}
                        >
                        {number}
                    </button>
                )
            }
        </div>
    )
}

export default Paginate;


