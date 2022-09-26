package ezmes.infra;
import ezmes.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/equipment")
@Transactional
public class EquipmentController {
    @Autowired
    EquipmentRepository equipmentRepository;





    @RequestMapping(value = "equipment/{id}/cancel",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Equipment 설비취소(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /equipment/설비취소  called #####");
            Optional<Equipment> optionalEquipment = equipmentRepository.findById(id);
            
            optionalEquipment.orElseThrow(()-> new Exception("No Entity Found"));
            Equipment equipment = optionalEquipment.get();
            equipment.설비취소();
            
            equipmentRepository.save(equipment);
            return equipment;
            
    }
    



}
