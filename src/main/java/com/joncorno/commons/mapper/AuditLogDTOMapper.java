package com.joncorno.commons.mapper;

import org.javers.core.commit.CommitMetadata;
import org.javers.core.diff.changetype.PropertyChangeType;
import org.javers.core.diff.changetype.ValueChange;

import com.joncorno.commons.dto.AuditChangeDTO;
import com.joncorno.commons.dto.AuditCommitMetadataDTO;

import java.util.Optional;

/**
 * Audit log dto mapper sınıfı.
 */
public class AuditLogDTOMapper {

    /**
     * Change to audi change dto audit change dto.
     *
     * @param change change
     * @return audit change dto
     */
    public AuditChangeDTO changeToAudiChangeDTO(ValueChange change) {
        AuditChangeDTO auditChangeDTO = new AuditChangeDTO();
        auditChangeDTO.setEntityAdi(change.getAffectedGlobalId().getTypeName());
        auditChangeDTO.setEntityId(Long.valueOf(
                change.getAffectedGlobalId().value()
                        .substring(change.getAffectedGlobalId().value().lastIndexOf('/') + 1)));
        AuditCommitMetadataDTO auditCommitMetadataDTO = new AuditCommitMetadataDTO();
        Optional<CommitMetadata> commitMetadataOptional = change.getCommitMetadata();
        if (commitMetadataOptional.isPresent()) {
            auditCommitMetadataDTO.setCommitId(commitMetadataOptional.get().getId().valueAsNumber().longValue());
            auditCommitMetadataDTO.setAuthor(commitMetadataOptional.get().getAuthor());
            auditCommitMetadataDTO.setCommitDate(commitMetadataOptional.get().getCommitDate().toLocalDate());
            auditCommitMetadataDTO.setCommitDateInstant(commitMetadataOptional.get().getCommitDateInstant());
        }
        auditChangeDTO.setAuditCommitMetadataDTO(auditCommitMetadataDTO);
        if (change.getLeft() != null)
            auditChangeDTO.setBirOncekiDegisiklik(change.getLeft().toString());
        if (change.getRight() != null)
            auditChangeDTO.setBirSonrakiDegisiklik(change.getRight().toString());
        auditChangeDTO.setDegisenPropertyAdi(change.getPropertyName());
        if(change.getChangeType().equals(PropertyChangeType.PROPERTY_ADDED)){
            auditChangeDTO.setDegisiklikTipi("Oluşturuldu");
        }else if(change.getChangeType().equals(PropertyChangeType.PROPERTY_REMOVED)){
            auditChangeDTO.setDegisiklikTipi("Silindi");
        }else if(change.getChangeType().equals(PropertyChangeType.PROPERTY_VALUE_CHANGED)){
            auditChangeDTO.setDegisiklikTipi("Değiştirildi");
        }
        return auditChangeDTO;

    }

}
