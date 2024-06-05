# My HTMX

## Description
htmx is a library that allows you to access modern browser features directly from HTML, rather than using javascript.

## Captured

### 01 - Load a website dynamically without leaving the page

- WebsiteLoaderController
- takes a url from a form and will dynamically return an iframe with that url
- website.html fragment returns iframe

![Dynamically Load URL](src/main/resources/static/images/load-dynamic-web.png)

### 02 Load More Contacts

This example demonstrates how to load more contacts using htmx. The initial page loads returns the `01/index.html`
view which contains the first 3 contacts. When you click the load contacts button a call is made to the `_01/ContactsController`
to request the next 3 contacts. The response is then inserted into the DOM using htmx.

![Load More Contacts](src/main/resources/static/images/load-more-contacts.png)