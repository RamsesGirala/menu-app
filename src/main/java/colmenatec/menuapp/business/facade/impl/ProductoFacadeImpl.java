package colmenatec.menuapp.business.facade.impl;

import colmenatec.menuapp.business.facade.IProductoFacade;
import colmenatec.menuapp.business.mapper.IBaseMapper;
import colmenatec.menuapp.business.services.IBaseService;
import colmenatec.menuapp.domain.dto.ProductoDto;
import colmenatec.menuapp.domain.entities.Producto;
import org.springframework.stereotype.Service;

@Service
public class ProductoFacadeImpl extends BaseFacadeImpl<Producto, ProductoDto,Long> implements IProductoFacade {

    public ProductoFacadeImpl(IBaseService<Producto, Long> baseService, IBaseMapper<Producto, ProductoDto> baseMapper) {
        super(baseService, baseMapper);
    }


}
