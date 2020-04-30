// const square = function (x) {
//     return x * x
// }

// const multiply = (x, y) => {
//     return x * y
// }

// const add = (x, y) => x + y

// console.log(square(56))
// console.log(multiply(5, 9))
// console.log(add(3, 2))

const event = {
    name: 'Birthday Party',
    guestList: ['Chase', 'Mav', 'Rowlan'],
    printGuestList() {
        console.log('Guest List for ' + this.name)
        this.guestList.forEach((guest) => {
            console.log(guest + ' is attending ' + this.name)
        });
    }
}
event.printGuestList()