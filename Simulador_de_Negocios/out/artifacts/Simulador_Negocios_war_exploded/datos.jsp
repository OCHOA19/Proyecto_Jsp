<jsp:include page="views/header.jsp"></jsp:include>
<div class="container">
    <form class="col s12" action="/crearInversiones.jsp" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <h3>NUEVA INVERSION</h3>
           </div>
            <div class="row margin">
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="idinversiones">ID INVERSIONES</label>
                    <input type="text" name="idinversiones" placeholder="ID INVERSIONES" id="idinversiones" required>
                </div>
                <div class="col s1">
                </div>
                <div class="row margin"></div>
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="concepto">CONCEPTO</label>
                    <input type="text" name="concepto" placeholder="CONCEPTO" id="concepto" required>
                </div>
                <div class="col s1">
                </div>
                <div class="row margin"></div>
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="unidad_medida">UNIDAD MEDIDA</label>
                    <input type="unidad_medida" name="unidad_medida" placeholder="UNIDAD_MEDIDA" id="unidad_medida" required>
                </div>
                <div class="col s1">
                </div>
            </div>
            <div class="col s4">
            </div>
            <div class="row margin">
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="cantidad">CANTIDAD</label>
                    <input type="text" name="cantidad" placeholder="cantidad" id="cantidad" required>
                </div>
                <div class="col s1">
                </div>
                <div class="row margin"></div>
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="precio_unitario">PRECIO_UNITARIO</label>
                    <input type="text" name="precio_unitario" placeholder="PRECIO_UNITARIO" id="precio_unitario" required>
                </div>
                <div class="col s1">
                </div>
                <div class="row margin"></div>
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="subtotal_1">SUBTOTAL 1</label>
                    <input type="subtotal_1" name="subtotal_1" placeholder="SUBTOTAL_1" id="subtotal_1" required>
                </div>
                <div class="col s1">
                </div>
            </div>
            <div class="col s4">
            </div>
            <div class="row margin">
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="aportacion_propio">APORTACION_PROPIO</label>
                    <input type="text" name="aportacion_propio" placeholder="aportacion_propio" id="aportacion_propio" required>
                </div>
                <div class="col s1">
                </div>
                <div class="row margin"></div>
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="aportacion_financiacion">APORTACION_FINANCIACION</label>
                    <input type="text" name="aportacion_financiacion" placeholder="aportacion_financiacion" id="aportacion_financiacion" required>
                </div>
                <div class="col s1">
                </div>
                <div class="row margin"></div>
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="subtotal_2">SUBTOTAL_2</label>
                    <input type="subtotal_2" name="subtotal_2" placeholder="SUBTOTAL_2" id="subtotal_2" required>
                </div>
                <div class="col s1">
                </div>
            </div>
            <div class="col s4">
            </div>
            <div class="row margin">
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="datos_empresa_id_empresa">DATOS_EMPRESA_ID_EMPRESA</label>
                    <input type="text" name="datos_empresa_id_empresa" placeholder="DATOS_EMPRESA_ID_EMPRESA" id="datos_empresa_id_empresa" required>
                </div>
                <div class="col s1">
                </div>
                <div class="row margin"></div>
                <div class="col s1">
                </div>
                <div class="col s10">
                    <label for="depreciacion_amortizacion">DEPRECIACION_AMORTIZCION</label>
                    <input type="text" name="depreciacion_amortizacion" placeholder="depreciacion_amortizacion" id="depreciacion_amortizacion" required>
                </div>
                <div class="col s1">
                </div>
            </div>
            <div class="col s4">
            </div>
            <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s2">
            <a class="btn col s2" href="index.jsp">Regresar</a>
        </div>
    </form>
</div>
<jsp:include page="views/footer.jsp"></jsp:include>