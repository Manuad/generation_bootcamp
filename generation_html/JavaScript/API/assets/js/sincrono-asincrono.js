/*
const timeOut = 3000;

setTimeout(() => {
    let data = "Manu";
    console.log(data);
}, timeOut);

*/

const data = [
    {
        name: "Manu",
        age: "30"
    },
    {
        name: "Juan",
        age: "25"
    },
    {
        name: "Pedro",
        age: "35"
    }
];

/*
//Promesas
*/
function getData() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(data);
        }, 3000);
    });
}

getData().then(() => {
    console.log(data);
});

/**
 * Async Await
 */

async function getDataAsync() {
    const dataGetted = await getData();

    console.log(dataGetted);
}

getDataAsync();