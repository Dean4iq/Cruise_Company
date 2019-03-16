<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

        <nav class="navbar navbar-expand-lg navbar-dark" style="background-color:#0c5e00;margin:10px">
            <a class="navbar-brand" href=""></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="${pageContext.request.contextPath}">
                            ${sessionLocalization['menu.main']}
                        </a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="search">
                            ${sessionLocalization['menu.search']}
                        </a>
                    </li>
                    <c:forEach items="${Role.menuBarLinks}" var="keyValue">
                        <li class="nav-item active">
                            <a class="nav-link" href="${keyValue.value}">
                                <c:out value="${sessionLocalization[keyValue.key]}"/>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <h5 style="padding:8px; color:#F4F12F;">${User.login}</h5>
                    </li>
                    <li class="nav-item active" style="margin-right:35px;">
                        <a class="nav-link" href="logout">
                            ${sessionLocalization['menu.logout']}
                        </a>
                    </li>
                    <form name="langForm" method="post" align="right">
                        <select name="langSelect" onchange="document.langForm.submit();">
                            <option ${sessionLanguage=="en"?"selected":""} value="en">English</option>
                            <option ${sessionLanguage=="uk"?"selected":""} value="uk">Українська</option>
                        </select>
                    </form>
                </ul>
            </div>
        </nav>