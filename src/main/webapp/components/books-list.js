
class BooksList extends HTMLElement{
    constructor() {
        super();
    }

    connectedCallback() {
        this.innerHTML = `This is books list`;
    }
}

window.customElements.define('books-list', BooksList)