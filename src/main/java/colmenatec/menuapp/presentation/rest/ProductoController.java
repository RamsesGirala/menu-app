package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.impl.ProductoFacadeImpl;
import colmenatec.menuapp.domain.dto.ProductoDto;
import colmenatec.menuapp.domain.entities.Producto;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController extends BaseControllerImpl<Producto, ProductoDto,Long, ProductoFacadeImpl> {

    public ProductoController(ProductoFacadeImpl facade) {
        super(facade);
    }

}
