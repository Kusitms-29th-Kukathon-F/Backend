package com.kukathonF.backend.web.service;

import com.kukathonF.backend.domain.entity.GiftBox;
import com.kukathonF.backend.domain.entity.Item;
import com.kukathonF.backend.domain.repository.GiftBoxRepository;
import com.kukathonF.backend.domain.repository.ItemRepository;
import com.kukathonF.backend.web.dto.ItemResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final GiftBoxRepository giftBoxRepository;
    private final ItemRepository itemRepository;

    @Transactional(readOnly = true)
    public List<ItemResponse> findUserItems(Long userId) {
        List<GiftBox> findGiftBoxes = giftBoxRepository.findByUserId(userId);
        List<Item> allItems = itemRepository.findAll();



        List<Item> findItems = findGiftBoxes.stream().map(GiftBox::getItem).toList();

        return ItemResponse.ofList(findItems);
    }
}
